package pl.imijad.Dybowski;
import java.time.LocalDate;
abstract class instrument {
    public instrument(String producent, LocalDate rokProdukcji)
    {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    private String producent;
    private LocalDate rokProdukcji;

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }
    abstract void dzwiek();

    @Override
    public String toString() {
        return "producent:" + producent  + " rokProdukcji:" + rokProdukcji;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        instrument other = (instrument) obj;
        if (producent == null) {
            if (other.producent != null)
                return false;
        } else if (!producent.equals(other.producent))
            return false;
        if (rokProdukcji != other.rokProdukcji)
            return false;
        return true;
    }
}



