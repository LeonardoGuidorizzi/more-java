

public class tabuadacorreção {
    public static void main(String[] args) {
        int n = 5;
        //Qtde de tabuadas
        for (int i=0;i<=2;i++){
             // Contrução da tabuada
            for(int j=0;j<+10;j++){
                System.out.print(n+"x" + j + "="+n*j);
            }
            n++;
            System.out.println();
        }
        
    }
    
}