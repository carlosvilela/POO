
public class Main {

	public static void main(String[] args) {
            
            int x[] = new int[5];
            x[0] = 1;
            x[1] = 10;
            x[2] = 5;
            x[3] = 0;
            x[4] = 2;
            
            int s = somatorio(x);
            int m = minimo(x);
            System.out.println("S = "+s);
            System.out.println("minimo = "+m);
	}
        
        public static int somatorio(int w[]){
            
            int s = 0;
            
            int n = w.length;
            
            for (int i = 0; i<n; i++){
                s = s+w[i];
            }
            
            return s;
        }
        
        public static int minimo(int w[]){
            int n = w.length;
            
            int m = w[0];
            
            for (int i = 0; i<n; i++){
                if (w[i]<m){
                    m = w[i];
                }
            }
            return m;
        }

}
