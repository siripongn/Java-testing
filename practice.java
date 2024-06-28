public class practice {
    public static void main(String[] args) {
        
        int m = 7;
        int n = (m+1)/2;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( ((j <= n + (i - 1)) && (j > m - n - (i - 1))) ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( (j > i - 1) && (j <= m - (i - 1)) ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

///////////////////////////////////////////////
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( j <= (i - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( j <= n) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( (j <= n + (i - 1)) ){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

//////////////////////////////////////////////

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( (j > m ) ) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( (j >  n - (i - 1)) ) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if( (j > m - n - (i - 1)) ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();






        // int r = 3, c = 4;
        // for(int i = 1; i <= r; i++) {
        //     for(int j = 1; j <= c; j++) {
        //         if(i==1 || j ==1 || i == r || j == c ) {
        //             System.out.print(" + ");
        //         } 
        //         else {
        //             System.out.print(" = ");
        //         }
        //     }
        //     System.out.println();
        // }

    }
}