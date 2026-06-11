#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

typedef struct {
    char* data;
    int top;
    int capacity;
} Stack;

Stack* createStack(int size) {
    Stack* stack = (Stack*)malloc(sizeof(Stack));
    stack->data = (char*)malloc(size * sizeof(char));
    stack->top = -1;
    stack->capacity = size;
    return stack;
}

void push(Stack* stack, char c) {
    if (stack->top < stack->capacity - 1) {
        stack->data[++stack->top] = c;
    }
}

char pop(Stack* stack) {
    if (stack->top >= 0) {
        return stack->data[stack->top--];
    }
    return '\0';
}

char peek(Stack* stack) {
    if (stack->top >= 0) {
        return stack->data[stack->top];
    }
    return '\0'; 
}

bool isEmpty(Stack* stack) {
    return stack->top == -1;
}

void freeStack(Stack* stack) {
    free(stack->data);
    free(stack);
}

bool isValid(char* s) {
    int len = strlen(s);
    Stack* stack = createStack(len);

    for (int i = 0; i < len; i++) {
        char c = s[i];
        if (c == '(' || c == '{' || c == '[') {
            push(stack, c);
        } else {
            if (isEmpty(stack)) {
                freeStack(stack);
                return false;
            }
            char top = pop(stack);
            if ((c == ')' && top != '(') ||
                (c == '}' && top != '{') ||
                (c == ']' && top != '[')) {
                freeStack(stack);
                return false;
            }
        }
    }

    bool valid = isEmpty(stack);
    freeStack(stack);
    return valid;
}
