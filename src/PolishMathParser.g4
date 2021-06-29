parser grammar PolishMathParser;

options { tokenVocab=PolishMathLexer; }

// @header {
//    package polish;
//}

// https://github.com/antlr/antlr4/blob/master/doc/parser-rules.md#rule-element-labels

///////////////////// General Rule /////////////////////
file
    : statement* EOF
    ;

///////////////////// General Parameter Formats /////////////////////
parExpression
    : LPAREN expression RPAREN
    ;

parameters
    : LPAREN parameterList? RPAREN
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : expression
    ;

///////////////////// Blocks /////////////////////
block
    : LBRACE statement* RBRACE
    ;

///////////////////// Statements /////////////////////
statement
    : block
    | ifStatement
    | whileStatement
    | returnStatement SEMI
    | functionDeclaration 
    | variableDeclaration SEMI
    | statExpression=expression SEMI
    ;

    // General Statement Rules

    ifStatement
        : IF parExpression THEN statement (ELSE statement)? ENDIF
        ;

    whileStatement
        : WHILE parExpression DO statement LOOP
        ;

    returnStatement
        : RETURN expression?
        ;

    functionDeclaration
        : scopeModifier? FUN runtimeFunctionIdentifier parameters functionBody ENDFUN
        ;

        runtimeFunctionIdentifier
            : IDENTIFIER
            ;

        functionBody
            : block
            ;

    variableDeclaration
        : scopeModifier variableIdentifier ASSIGN expression
        ;

        scopeModifier
            : LET
            | VAR
            ;

        variableIdentifier
            : IDENTIFIER
            ;

///////////////////// Expression /////////////////////
expression
    : literal
    | runtimeFunctionCall
    | builtinFunctionCall
    | variableIdentifier
    | logicalNegation
    | mathematicalOperation
    | logicalComparison
    | parExpression
    | <assoc=right> expression ASSIGN expression
    ;

    // General Expression Rules
    
    literal
        : logicalLiteral
        | DECIMAL_LITERAL
        | FLOAT_LITERAL
        | STRING_LITERAL
        ;

        // Forced by lexer to place this here.
        logicalLiteral: (TRUE|FALSE);

    runtimeFunctionCall
        : runtimeFunctionIdentifier parameters
        ;

    builtinFunctionCall
        : builtinFunctionIdentifier parameters
        ;

        builtinFunctionIdentifier: builtinFunction;

            // Forced by lexer to place this here.
            builtinFunction: (SCN);

    logicalNegation
        : NOT expression
        ;

    mathematicalOperation
        : op=(POW | MOD) expression expression
        | op=(MUL | DIV) expression expression
        | op=(ADD | SUB) expression expression
        ;

    logicalComparison
        : op=(AND | OR) expression expression
        | op=(EQ | NOTEQ) expression expression
        | op=(LEQ | GEQ) expression expression
        | op=(GT | LT) expression expression
        ;