grammar python;

// Parser rules

program
    : stmt_list EOF
    ;

stmt_list
    : (stmt NEWLINE)* stmt? NEWLINE?
    ;

// now a stmt can be a simple_stmt OR an if_stmt
stmt
    : simple_stmt
    | if_stmt
    ;





simple_stmt
    : assignment
    | expr
    ;

// ----- IF / ELIF / ELSE -----

if_stmt
    : IF condition ':' NEWLINE stmt
      (ELIF condition ':' NEWLINE stmt)*
      (ELSE ':' NEWLINE stmt)?
    ;

// A condition is just an expression that may include comparison operators
condition
    : expr
    ;

// ----- EXPRESSIONS -----

// expr now supports relational operators with lower precedence
expr
    : arith_expr (rel_op arith_expr)?      // e.g., a < b, x == y + 1
    ;

// comparison operators
rel_op
    : '<'
    | '>'
    | '<='
    | '>='
    | '!='
    | '=='
    ;

// arithmetic part (same as your old expr)
arith_expr
    : term (('+' | '-') term)*
    ;

term
    : factor (('*' | '/' | '%') factor)*
    ;

factor
    : ('+' | '-') factor
    | atom
    ;

atom
    : ID
    | INT
    | '(' expr ')'
    ;

// ----- ASSIGNMENTS -----

assignment
    : ID assign_op expr
    ;

assign_op
    : '='
    | '+='
    | '-='
    | '*='
    | '/='
    ;

// Lexer rules

NEWLINE
    : ('\r'? '\n')+
    ;

// Keywords must come BEFORE ID so they are not matched as identifiers
IF
    : 'if'
    ;

ELIF
    : 'elif'
    ;

ELSE
    : 'else'
    ;

ID
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

INT
    : [0-9]+
    ;

WS
    : [ \t]+ -> skip
    ;
