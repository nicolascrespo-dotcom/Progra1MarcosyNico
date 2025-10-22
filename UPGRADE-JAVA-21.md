Upgrade to Java 21
===================

This repository contains Java exercise source files. This document explains how to install Java 21 (LTS) on Linux, verify it, and compile all exercises.

1) Install a JDK 21 distribution

Choose one of the options below depending on your preference and distro.

- Temurin (Adoptium) - Debian/Ubuntu example:

```bash
sudo apt-get update
sudo apt-get install -y wget gnupg
wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | sudo gpg --dearmor -o /usr/share/keyrings/adoptium.gpg
echo "deb [signed-by=/usr/share/keyrings/adoptium.gpg] https://packages.adoptium.net/artifactory/deb/ focal main" | sudo tee /etc/apt/sources.list.d/adoptium.list
sudo apt-get update
sudo apt-get install -y temurin-21-jdk
```

- SDKMAN (any Linux distro):

```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 21.ea.r17-grl  # replace with one of the java 21 candidates from `sdk list java`
```

2) Make Java 21 default

Use `update-alternatives` or set `JAVA_HOME`:

```bash
sudo update-alternatives --config java
sudo update-alternatives --config javac
# or set environment variable
export JAVA_HOME=/usr/lib/jvm/temurin-21-jdk-amd64  # adjust to your install path
export PATH="$JAVA_HOME/bin:$PATH"
```

3) Verify

```bash
java -version
javac -version
```

4) Compile the repository (helper script)

There's a helper script at `scripts/compile_all.sh` that compiles all `.java` files with `--release 21` and puts class files in `out/`.

```bash
chmod +x scripts/compile_all.sh
./scripts/compile_all.sh
```

5) If you have Maven or Gradle (none detected in the repo root):

- Maven: set `maven.compiler.release` or `maven.compiler.source/target` to 21 or configure `maven-compiler-plugin` to use `<release>21</release>`.
- Gradle: use the Java toolchain, set `languageVersion = JavaLanguageVersion.of(21)` or `sourceCompatibility = '21'`.

6) Notes

- Java 21 is mostly backward compatible. If you use internal or removed APIs, you'll need code changes.
- If you want me to update a specific `pom.xml` or `build.gradle`, provide its path and I'll create a patch.
