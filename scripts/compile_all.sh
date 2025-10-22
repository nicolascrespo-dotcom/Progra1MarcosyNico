#!/usr/bin/env bash
# Compile Java files per directory to avoid duplicate-class conflicts.
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
OUT_DIR="$ROOT_DIR/out"

echo "Repository root: $ROOT_DIR"

if ! command -v javac >/dev/null 2>&1; then
  echo "Error: javac not found. Please install JDK 21 and make sure javac is on PATH." >&2
  exit 2
fi

mkdir -p "$OUT_DIR"

# Find directories that contain .java files (exclude out/ and .git)
mapfile -t DIRS < <(find "$ROOT_DIR" -type f -name "*.java" -not -path "*/out/*" -not -path "*/.git/*" -printf "%h\n" | sort -u)

if [ ${#DIRS[@]} -eq 0 ]; then
  echo "No Java source files found in repository." >&2
  exit 1
fi

total=0
for d in "${DIRS[@]}"; do
  files=("$d"/*.java)
  # Skip if no java files in this dir
  if [ ! -e "${files[0]}" ]; then
    continue
  fi
  count=${#files[@]}
  total=$((total + count))
done

echo "Found $total Java file(s) across ${#DIRS[@]} directory(ies). Compiling with --release 21..."

for d in "${DIRS[@]}"; do
  rel=$(realpath --relative-to="$ROOT_DIR" "$d")
  out="$OUT_DIR/$rel"
  mkdir -p "$out"
  echo "Compiling $rel -> $out"
  javac --release 21 -d "$out" "$d"/*.java || {
    echo "Compilation failed in $d" >&2
    exit 1
  }
done

echo "Compilation finished. Class files are in subfolders under: $OUT_DIR"
echo "Run with: java -cp out/<relative-path> <MainClass>"
#!/usr/bin/env bash
# Compile Java files per directory to avoid duplicate-class conflicts.
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
OUT_DIR="$ROOT_DIR/out"

echo "Repository root: $ROOT_DIR"

if ! command -v javac >/dev/null 2>&1; then
  echo "Error: javac not found. Please install JDK 21 and make sure javac is on PATH." >&2
  exit 2
fi

mkdir -p "$OUT_DIR"

# Find directories that contain .java files (exclude out/ and .git)
mapfile -t DIRS < <(find "$ROOT_DIR" -type f -name "*.java" -not -path "*/out/*" -not -path "*/.git/*" -printf "%h\n" | sort -u)

if [ ${#DIRS[@]} -eq 0 ]; then
  echo "No Java source files found in repository." >&2
  exit 1
fi

total=0
for d in "${DIRS[@]}"; do
  files=("$d"/*.java)
  # Skip if no java files in this dir
  if [ ! -e "${files[0]}" ]; then
    continue
  fi
  count=${#files[@]}
  total=$((total + count))
done

echo "Found $total Java file(s) across ${#DIRS[@]} directory(ies). Compiling with --release 21..."

for d in "${DIRS[@]}"; do
  rel=$(realpath --relative-to="$ROOT_DIR" "$d")
  out="$OUT_DIR/$rel"
  mkdir -p "$out"
  echo "Compiling $rel -> $out"
  javac --release 21 -d "$out" "$d"/*.java || {
    echo "Compilation failed in $d" >&2
    exit 1
  }
done

echo "Compilation finished. Class files are in subfolders under: $OUT_DIR"
echo "Run with: java -cp out/<relative-path> <MainClass>"
#!/usr/bin/env bash
# Compile all .java files in the repository for Java 21 into the out/ directory
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
OUT_DIR="$ROOT_DIR/out"

echo "Repository root: $ROOT_DIR"

if ! command -v javac >/dev/null 2>&1; then
  echo "Error: javac not found. Please install JDK 21 and make sure javac is on PATH." >&2
  exit 2
fi

mkdir -p "$OUT_DIR"

# Find java files (exclude out/ and .git)
mapfile -t FILES < <(find "$ROOT_DIR" -type f -name "*.java" -not -path "*/out/*" -not -path "*/.git/*")

if [ ${#FILES[@]} -eq 0 ]; then
  echo "No Java source files found in repository." >&2
  exit 1
fi

echo "Compiling ${#FILES[@]} Java file(s) with --release 21..."

# Use --release 21 to target Java 21; javac will fail if it doesn't support it
javac --release 21 -d "$OUT_DIR" "${FILES[@]}"

echo "Compilation finished. Class files are in: $OUT_DIR"
echo "You can run compiled classes with: java -cp $OUT_DIR <MainClass>"
