# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java learning/refresher project with a simple class structure for demonstrating basic Java concepts and mathematical calculations.

## Build System

This project uses Apache Ant for building:
- `build.xml`: Main Ant build file

### Common Commands

```bash
# Build the project
ant build

# Clean build artifacts
ant clean

# Clean and rebuild
ant clean build

# Run the application
ant run

# Create JAR file
ant jar
```

## Project Structure

```
src/javarefresher/
├── JavaRefresher.java    # Main entry point
└── Calculator.java       # Mathematical operations (sqrt, cbrt, circle area)
```

### Architecture

- **JavaRefresher.java**: Main class containing `main()` method. Demonstrates Calculator usage with various mathematical operations.
- **Calculator.java**: Utility class providing mathematical calculation methods with input validation.

Build output goes to `out/production/` directory.

## Code Conventions

- Package: `javarefresher`
- Classes follow standard Java naming conventions (PascalCase)
- Methods include Javadoc comments with parameter and return descriptions
- Input validation with `IllegalArgumentException` for invalid inputs
