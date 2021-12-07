package pl.imijad.Dybowski;

import java.time.LocalDate;

class flet extends instrument{
    public flet (String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    void dzwiek() {
        System.out.println("fiuuu");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

