package ordenarnumeros;

public class OrdenarNumeros {

    public static void main(String[] args) {
    
        int imprimir=0;
        
        int n1 =(int) (Math.random()*100);
        int n2 =(int) (Math.random()*100);
        int n3 =(int) (Math.random()*100);
        
        System.out.println("Numeros sin ordenar");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("Numeros ordenados de manera descendente");
        
        if ((n1 > n2 && n1>n3) && (n2<n1 && n2>n3) && (n3<n1 && n3<n2) ){
           imprimir=1;
        }
        if ((n2 > n1 && n2>n3) && (n1<n2 && n1>n3) && (n3<n1 && n3<n2) ){
           imprimir=2;
        }
        if ((n3 > n1 && n3>n2) && (n2<n3 && n2>n1) && (n1<n3 && n1<n2) ){
           imprimir=3;
        }
        if ((n1 > n2 && n1>n3) && (n3<n1 && n3>n2) && (n2<n3 && n2<n1) ){
           imprimir=4;
        }
        if ((n2 > n1 && n2>n3) && (n3>n1 && n3<n2) && (n1<n3 && n1<n3) ){
           imprimir=5;
        }
        if ((n3 > n1 && n3>n2) && (n1>n2 && n1<n3) && (n2<n3 && n2<n1) ){
           imprimir=6;
        }
        if ((n1 == n2 && n1==n3)){
           imprimir=7;
        }
        if ((n1 == n2 && n1>n3)){
           imprimir=8;
        }
        if ((n3 == n2 && n1<n3)){
           imprimir=9;
        }
        if ((n3 == n2 && n1>n3)){
           imprimir=10;
        }
        if ((n1 == n3 && n2>n1)){
           imprimir=11;
        }
        if ((n1 == n2 && n1<n3)){
           imprimir=12;
        }
        if ((n1 == n3 && n2<n1)){
           imprimir=13;
        }
        if (imprimir==1){
            
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        }
        if (imprimir==2){
            
        System.out.println(n2);
        System.out.println(n1);
        System.out.println(n3);
    
    }
        if (imprimir==3){
            
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);
    
    }
        if (imprimir==4){
            
        System.out.println(n1);
        System.out.println(n3);
        System.out.println(n2);
    
    }
        if (imprimir==5){
            
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1);
    
    }
        if (imprimir==6){
            
        System.out.println(n3);
        System.out.println(n1);
        System.out.println(n2);
    
    }
         if (imprimir==7){
            
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    
    }
          if (imprimir==8){
            
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    
    }
          if (imprimir==9){
            
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);
    
    }
          if (imprimir==10){
            
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    
    }
          if (imprimir==11){
            
        System.out.println(n2);
        System.out.println(n1);
        System.out.println(n3);
    
    }
          if (imprimir==12){
            
        System.out.println(n3);
        System.out.println(n1);
        System.out.println(n2);
    
    }
          if (imprimir==13){
            
        System.out.println(n1);
        System.out.println(n3);
        System.out.println(n2);
    
    }

        }
    }


    
