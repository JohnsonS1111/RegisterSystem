package ie.atu;

public class StudentPay {
   private String iban;
   private String bic;
   private String id;
   private int amount;
   private int due;
   private int fee = 3000;

   public StudentPay(String iban, String bic, String id, int amount, int due, int fee){
         setIban(iban);
         setBic(bic);
         setId(id);
         setAmount(amount);
         due = 0;
         fee = 3000;
   }


   public void setAmount(int amount) {
       while(this.amount != amount) {
           if (amount >= 100) {
               this.amount = amount;
           } else {
               throw new IllegalArgumentException("The deposit must be at least €100. Please re- enter amount you wish to pay.");
           }
       }
   }

    public void setId(String id) {
       while(this.id != id) {
           if (String.valueOf(id).length() >= 10) {
               this.id = id;
           } else {
               throw new IllegalArgumentException("ID should be a minimum of 10 characters. Please re- enter ID");
           }
       }
   }

    public void setBic(String bic) {
       while(this.bic != bic) {
           if (String.valueOf(bic).length() >= 8) {
               this.bic = bic;
           } else {
               throw new IllegalArgumentException("Invalid BIC entered. BIC should be at least be 8 characters long. Please re- enter BIC.");
           }
       }
   }

    public void setIban(String iban) {
       while(this.iban != iban){
           if(String.valueOf(iban).length() >= 14){
               this.iban = iban;
           } else{
               throw new IllegalArgumentException("Invalid Iban entered. Iban should be at least 18 characters long. Please re- enter IBan");
           }
       }
   }
    public int getAmount() {
        return amount;
    }

    public int getDue(int fee, int amount) {
        due = fee - amount;
        return due;
    }

    public String getBic() {
        return bic;
    }

    public String getIban() {
        return iban;
    }

    public String getId() {
        return id;
    }
}
