package pl.imijad.Dybowski;

import java.time.LocalDate;

class fortepian extends instrument{
    public fortepian (String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    void dzwiek() {
        System.out.println("dun");
    }

}