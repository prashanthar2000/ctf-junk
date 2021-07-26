#define MAX 100 
#include <stdio.h> 
#include <stdlib.h> 
struct bst { int height; int width; };

int main(){
/* bd dimensions.*/
int m,n, error;
struct bst *bd;
printf("Enter bd height: \n");
error = scanf("%d", &m);
if ( EOF == error ){
printf("Not available: Die Hard!\n");
}
printf("Please specify the bd width: \n");
error = scanf("%d", &n);
if ( EOF == error ){
 printf("Not available: Die Hard!\n");
}
if ( m > MAX || n > MAX ) {
printf("Large value: Die hard!\n");
}
bd = (struct bst*) malloc( m * n * sizeof(struct bst));
return 0;
}
