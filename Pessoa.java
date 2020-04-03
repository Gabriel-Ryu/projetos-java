
public class Pessoa
{
    double peso;
    double altura;
    double testealtura = 1.70;
    double testepeso = 70;
    
    
    
    public double calcImc(){
        peso = testepeso;
        altura=testealtura;
        double imc = this.peso*(this.altura*this.altura);
        if(imc < 18.5){
            System.out.println("Riscos baixos");
        }
        if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Normal");
        }
        if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Elevado");
        }
        if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Alto");
        }
        if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Alto");
        }
        else{
            System.out.println("Iminente");
        }
        return imc;
    }
}
