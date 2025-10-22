#!/usr/bin/env bash
set -euo pipefail

echo "Installing Temurin 21 to user local (~/.local/java)"

INSTALL_DIR="$HOME/.local/java"
TMP_ARCHIVE="/tmp/temurin21.tar.gz"

mkdir -p "$INSTALL_DIR"

echo "Downloading Temurin 21 binary (this may take a while)..."
curl -L -o "$TMP_ARCHIVE" "https://api.adoptium.net/v3/binary/latest/21/ga/linux-x64/jdk/hotspot/normal/adoptium"

echo "Extracting to $INSTALL_DIR"
tar -xzf "$TMP_ARCHIVE" -C "$INSTALL_DIR"

# Find extracted folder (jdk-21* or similar)
EXTRACTED_DIR=$(find "$INSTALL_DIR" -maxdepth 1 -type d -name "*jdk*21*" -printf "%f\n" | head -n1 || true)
if [ -z "$EXTRACTED_DIR" ]; then
  # fallback: take the first folder
  EXTRACTED_DIR=$(find "$INSTALL_DIR" -maxdepth 1 -type d -printf "%f\n" | grep -v "^\.\.?$" | head -n1 || true)
fi

if [ -z "$EXTRACTED_DIR" ]; then
  echo "Could not locate extracted JDK folder in $INSTALL_DIR" >&2
  exit 2
fi

FULL_JAVA_HOME="$INSTALL_DIR/$EXTRACTED_DIR"

echo "Setting JAVA_HOME to $FULL_JAVA_HOME for current session"
export JAVA_HOME="$FULL_JAVA_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

echo "Persisting JAVA_HOME and PATH to ~/.bashrc (idempotent)"
grep -qxF "# Java 21 (Temurin) user install" "$HOME/.bashrc" || cat >> "$HOME/.bashrc" <<'EOF'
# Java 21 (Temurin) user install
export JAVA_HOME="$HOME/.local/java/$(ls -1 "$HOME/.local/java" | head -n1)"
export PATH="$JAVA_HOME/bin:$PATH"
EOF

echo "Cleaning up temporary archive"
rm -f "$TMP_ARCHIVE"

echo "Installation complete. Current java version:"
java -version || true

echo "Note: restart your terminal or source ~/.bashrc to use JAVA_HOME persistently."
