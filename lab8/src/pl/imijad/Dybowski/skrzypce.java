package pl.imijad.Dybowski;

import java.time.LocalDate;

class skrzypce extends instrument{
    public skrzypce (String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    void dzwiek() {
        System.out.println("truuu");
    }
    }
