public class Vendedor {
   private int Costo, Plan; 
   private boolean Donativo,Seguro;


   public Vendedor(){
    this.Costo = 256000;
        this.Plan = 25;
    this.Seguro = true;
    this.Donativo = false;
}

    public int getCosto(){
        return Costo;
    }
    public void setCosto(int Costo){
        this.Costo = Costo;
    }
    public boolean getSeguro(){
        return Seguro;
    }
    public void setSeguro(Boolean Seguro){
        this.Seguro = Seguro;
    }
    public int getPlan(){
        return Plan;
    }
    public void setPlan(int Plan){
        this.Plan = Plan;
    }
    public boolean getDonativo(){
        return Donativo;
    }
    public void setDonativo(Boolean Donativo){
        this.Donativo = Donativo;
    }
}