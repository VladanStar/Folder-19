
package javamtkompleksnibroj;


public class JavaMTKompleksniBroj {

    public static void main(String[] args) {
       KompleksniBroj x = new KompleksniBroj(1,1);
        System.out.println("x = " + x);
        System.out.println("Re x = " + x.Re());
        System.out.println("Im x = " + x.Im());
        System.out.println("Moduo x = " + x.moduo());
        System.out.println("Konjugovano x = " + x.konjugovaniBroj());
        System.out.println(" x + Konjugovano x = "+ KompleksniBroj.zbir(x, x.konjugovaniBroj()));
        
        System.out.println("");
        KompleksniBroj x1 = new KompleksniBroj(1,1);
        System.out.println("x1 = " + x1);
        System.out.println("Re x1 = " + x1.Re());
        System.out.println("Im x1 = " + x1.Im());
        System.out.println("Moduo x1 = " + x1.moduo());
        System.out.println("Konjugovano x1 = " + x1.konjugovaniBroj());
        System.out.println(" x1 + Konjugovano x1 = "+ KompleksniBroj.zbir(x1, x1.konjugovaniBroj()));
        
        
    }
    
}
