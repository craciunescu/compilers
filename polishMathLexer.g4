lexer grammar polishMathLexer;

// @header {
//    package polish;
// }

// LEXER

// Keywords
LET:                'let';
VAR:                'var';
FUN:                'fun';
ENDFUN:             'endfun';
WHILE:              'while';
DO:                 'do';
LOOP:               'loop';
IF:                 'if';
THEN:               'then';
ELSE:               'else';
ENDIF:              'endif';
SCN:                'scn';
RETURN:             'return';
TRUE:               'true';
FALSE:              'false';


// Literals
DECIMAL_LITERAL:    ('0' | [1-9] Digits?);
FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits);
STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';

// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';

// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
NOT:                '!';
EQ:                 '==';
LEQ:                '<=';
GEQ:                '>=';
NOTEQ:              '!=';
AND:                '&&';
OR:                 '||';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
POW:                '^';
MOD:                '\\';

// Whitespace and Comments
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

// Identifiers
IDENTIFIER:         Letter LetterOrDigit*;

// Fragment Rules
fragment Digits
    : [0-9] ([0-9]* [0-9])?
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    ;

fragment LetterOrDigit
    : Letter
    | [0-9]
    ;

fragment Letter
    : [a-zA-Z]
    ;