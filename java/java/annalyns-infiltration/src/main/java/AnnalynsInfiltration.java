class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
     //   throw new UnsupportedOperationException("Please implement the (static) //AnnalynsInfiltration.canFastAttack() method");
        if(knightIsAwake)
            return false;
        else
            return true;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) //AnnalynsInfiltration.canSpy() method");
        return (knightIsAwake || archerIsAwake || prisonerIsAwake) ? true : false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       // throw new UnsupportedOperationException("Please implement the (static) //AnnalynsInfiltration.canSignalPrisoner() method");
        return !archerIsAwake && prisonerIsAwake ? true : false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
     //   throw new UnsupportedOperationException("Please implement the (static) //AnnalynsInfiltration.canFreePrisoner() method");
        if(petDogIsPresent){
            return (archerIsAwake)?false:true;
                }
        else{
           return (prisonerIsAwake && !knightIsAwake && !archerIsAwake)? true:false;
        }
            
    }
}
