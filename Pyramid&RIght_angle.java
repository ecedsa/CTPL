class RPyramid{
    public static void main(String [] args){
        int n =5;
        for(int i = 1 ; i<=n; i++){
            for(int j= 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int s = 1; s<=2*i-1; s++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}




class Right_Pyramid
{
    public static void main(String[] args){
    int n=5;
    for(int i=1;i<n+1;i++){
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
    System.out.println();
    }
}
}
