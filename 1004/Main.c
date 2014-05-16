#include <stdio.h> 

int main() {
    double a, sum;
    int n;
    sum = 0.0;        
    while (scanf("%lf", &a) != EOF) {
        sum += a;
    } 
    printf("$%.02lf\n", sum/12);
    return 0;
}
