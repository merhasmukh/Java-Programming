# Lab Session 0: Java Development Environment Setup

## Learning Objectives
By the end of this setup, students will be able to:
1. Install and configure Java Development Kit (JDK)
2. Set up environment variables (PATH, JAVA_HOME)
3. Choose and install an appropriate IDE or text editor
4. Verify the installation by compiling and running a simple Java program
5. Understand the Java development workflow

## Step 1: Install Java Development Kit (JDK)

### What is JDK?
- **JDK (Java Development Kit)**: Complete development environment
- **JRE (Java Runtime Environment)**: Runtime environment for executing Java programs
- **JVM (Java Virtual Machine)**: Executes Java bytecode

### Download and Install JDK

#### For Windows:
1. Visit [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/)
2. Download JDK 17 or later (LTS version recommended)
3. Run the installer and follow installation wizard
4. Default installation path: `C:\Program Files\Java\jdk-17`

#### For Linux (Ubuntu/Debian):
```bash
# Update package index
sudo apt update

# Install OpenJDK 17
sudo apt install openjdk-17-jdk

# Verify installation
java -version
javac -version
```

#### For macOS:
```bash
# Using Homebrew
brew install openjdk@17

# Or download from Oracle website
```

## Step 2: Set Environment Variables

### Windows:
1. **Set JAVA_HOME:**
   - Right-click "This PC" → Properties → Advanced System Settings
   - Click "Environment Variables"
   - Under "System Variables", click "New"
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Java\jdk-17` (your JDK path)

2. **Update PATH:**
   - Find "Path" in System Variables, click "Edit"
   - Click "New" and add: `%JAVA_HOME%\bin`

### Linux/macOS:
Add to `~/.bashrc` or `~/.zshrc`:
```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

Reload the configuration:
```bash
source ~/.bashrc
```

## Step 3: Verify Installation

Open command prompt/terminal and run:
```bash
java -version
javac -version
```

Expected output:
```
java version "17.0.x" 2023-xx-xx LTS
Java(TM) SE Runtime Environment (build 17.0.x+xx-LTS-xxx)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x+xx-LTS-xxx, mixed mode, sharing)

javac 17.0.x
```

## Step 4: Choose Development Environment

### Option 1: Command Line + Text Editor
**Pros:** Lightweight, understand compilation process
**Cons:** No advanced features, manual compilation

**Recommended Editors:**
- **VS Code** (with Java Extension Pack)
- **Sublime Text**
- **Notepad++** (Windows)
- **Vim/Nano** (Linux)

### Option 2: Integrated Development Environment (IDE)
**Pros:** Advanced features, debugging, project management
**Cons:** Resource intensive, learning curve

**Recommended IDEs:**
- **IntelliJ IDEA Community** (Free, highly recommended)
- **Eclipse IDE for Java Developers** (Free)
- **NetBeans** (Free)
- **VS Code** with Java extensions (Lightweight)

## Step 5: Install VS Code with Java Extensions (Recommended for Beginners)

1. **Download VS Code:** https://code.visualstudio.com/
2. **Install Java Extension Pack:**
   - Open VS Code
   - Go to Extensions (Ctrl+Shift+X)
   - Search for "Extension Pack for Java"
   - Install the pack (includes multiple Java-related extensions)

### Key Extensions Included:
- **Language Support for Java** - Syntax highlighting, IntelliSense
- **Debugger for Java** - Debugging support
- **Test Runner for Java** - JUnit test support
- **Maven for Java** - Project management
- **Project Manager for Java** - Project creation and management

## Step 6: Create Your First Java Program

### Using Command Line:

1. **Create a directory:**
```bash
mkdir JavaLab
cd JavaLab
```

2. **Create HelloWorld.java:**
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Java is working!");
    }
}
```

3. **Compile and Run:**
```bash
javac HelloWorld.java
java HelloWorld
```

Expected output:
```
Hello, World!
Java is working!
```

### Using VS Code:

1. **Create new folder** and open in VS Code
2. **Create new file** `HelloWorld.java`
3. **Type the Java code** (IntelliSense will help)
4. **Run the program** using the "Run" button or Ctrl+F5

## Step 7: Understanding the Development Workflow

```
Write Code (.java) → Compile (javac) → Bytecode (.class) → Run (java) → Output
```

### Key Commands:
- `javac FileName.java` - Compile Java source code
- `java ClassName` - Run compiled Java program
- `java -cp . ClassName` - Run with classpath specification

## Common Installation Issues and Solutions

### Issue 1: "java is not recognized as internal or external command"
**Solution:** PATH environment variable not set correctly
- Verify JAVA_HOME is set
- Ensure %JAVA_HOME%\bin is in PATH
- Restart command prompt

### Issue 2: "Could not find or load main class"
**Solution:** 
- Check class name matches filename exactly
- Ensure you're in the correct directory
- Verify .class file was created during compilation

### Issue 3: Different Java versions
**Solution:**
- Use `java -version` and `javac -version` to check versions
- Ensure both point to the same JDK version
- Update environment variables if needed

## Lab Setup Checklist

- [ ] JDK installed and verified
- [ ] JAVA_HOME environment variable set
- [ ] PATH updated to include Java bin directory
- [ ] IDE/Editor installed and configured
- [ ] First Java program compiled and executed successfully
- [ ] Understanding of basic compilation workflow

## Additional Resources

### Official Documentation:
- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/)

### IDE-Specific Resources:
- [VS Code Java Tutorial](https://code.visualstudio.com/docs/java/java-tutorial)
- [IntelliJ IDEA Getting Started](https://www.jetbrains.com/help/idea/getting-started.html)
- [Eclipse IDE Tutorial](https://www.eclipse.org/getting_started/)

### Practice Platforms:
- [HackerRank Java Domain](https://www.hackerrank.com/domains/java)
- [LeetCode](https://leetcode.com/)
- [Codingbat Java](https://codingbat.com/java)

## Next Steps
Once your environment is set up:
1. Complete Lab 1: Main Method basics
2. Practice with simple programs
3. Explore IDE features gradually
4. Join Java programming communities for support

---
**Note:** This setup is one-time process. Once configured, you can focus on learning Java programming concepts!
