class DNASequence{

    private static int numberOfA;
    private static int numberOfT;
    private static int numberOfC;
    private static int numberOfG;
    private String DNA;
    
    public void asignaDNA(String nuevoDNA){
    DNA = nuevoDNA;
    }
    
    
    private void countNucleotides(){
    //Asigna los valores a numberOfX
    //identifiacar letra y sumar contador, cantidad de caracteres de la cadena, asignar valores del contador a los campos numberOfX

    for(int x=0; x<DNA.length();x++){
        char letra = DNA.charAt(x);
        if(letra=='A'){
            numberOfA++;
        }
        if(letra=='T'){
            numberOfT++;
        }
        if(letra=='C'){
            numberOfC++;
        }
        if(letra=='G'){
            numberOfG++;
        }
    }


    }
    
    public boolean twoConsecutive(char input){
    //Devuelve Verdadero si el Nucleotido aparece en alguna ubicacion de forma consecutiva ATCGGATL
    if (twoConsecutive('G')) {
        return true;
    }
    
       return false;
    }
    

    public static int getNumberA() {
    return numberOfA;
    }
    
    public static int getNumberT() {
    return numberOfT;
    }
    
    public static int getNumberG() {
    return numberOfG;
    }
    
    public static int getNumberC() {
    return numberOfC;
    }
    
    
    public static void main(String [] args){
    
    DNASequence dna = new DNASequence();
    //Solicita la cadena de DNA al usuario
    
    
    System.out.println("La cantidad de A son " + getNumberA());
    System.out.println("La cantidad de T son " + getNumberT());
    System.out.println("La cantidad de G son " + getNumberG());
    System.out.println("La cantidad de C son " + getNumberC());

    if (dna.twoConsecutive('G')){
    System.out.println("EL ADN tiene moleculas de guanina consecutivas");
    } else {
    System.out.println("EL ADN NO tiene moleculas de guanina consecutivas");
    }
    
    
    
    } 
}