# 4450PythonParser

# Python 3 Subset Parser with ANTLR4

This project implements a parser for a **subset of Python 3** using **ANTLR4** and a context-free grammar (`.g4` file).  
The goal is to recognize specific Python constructs and generate a **parse tree** for input Python programs, focusing on:

- Arithmetic expressions  
- Assignment operations  
- Conditionals (`if / elif / else`)  
- Boolean/relational operators  
- Loops (`while`, `for`)  
- Nested structures  
- Comments  

> **Note:** This is **not** a full Python parser. Only the features listed in the “Expected Features” section are supported.

---

## Team Members

- **NAME 1** – ROLE / RESPONSIBILITY (e.g., Grammar design, expressions)
- **NAME 2** – ROLE / RESPONSIBILITY (e.g., Control structures, loops)
- **NAME 3** – ROLE / RESPONSIBILITY (e.g., Comments, testing, demo video)

*(Remove or add lines as needed.)*

---

## Implemented Language Features (Project Requirements)

The grammar targets **Python 3.x** and supports the features required by the assignment:

### Deliverable #1 (30 pts)

- **Arithmetic operators:**  
  `+` `-` `*` `/` `%`
- **Assignment operators:**  
  `=` `+=` `-=` `*=` `/=`

### Deliverable #2 (30 pts)

- **If / Elif / Else blocks**
- **Conditional / Boolean operators:**
  - Relational: `<` `<=` `>` `>=` `==` `!=`
  - Logical: `and` `or` `not`

### Deliverable #3 (40 pts)

- **Loops:**
  - `while` loops
  - `for` loops (Python-style `for x in ...:`)
- **Nested structures:**
  - Nested `if` statements
  - Loops inside conditionals, and vice versa
- **Comments:**
  - Single-line comments (e.g., `# this is a comment`)
  - *(If you support more, describe it here.)*

### Python Indentation

Because Python is indentation-sensitive, our grammar and parser:

- Treat **indentation / dedentation** as significant
- Use custom lexer rules / tokens for `INDENT` and `DEDENT`
- Enforce block structure for:
  - `if / elif / else`
  - `while` and `for` loops

*(Briefly explain how you handled indentation, at a high level.)*

---

## Requirements & Environment

### Languages / Tools

- **Python:** `Python 3.X`  (we used **Python X.Y.Z**)
- **Java:** `Java 8+` (for running the ANTLR tool)
- **ANTLR4 Tool:** `4.13.1` (or your actual version)
- **ANTLR4 Runtime for Python:**
  - `antlr4-python3-runtime`

### Libraries / Dependencies

Install Python dependencies (adjust as needed):

```bash
pip install antlr4-python3-runtime
