import java.util.*;
// Клас, що представляє музиканта
class MusicianImpl implements Musician {
    private List<Instrument> instruments;

    public MusicianImpl() {
        this.instruments = new ArrayList<>();
    }

    public void playInstrument() {
        if (instruments.isEmpty()) {
            System.out.println("Музикант не грає на жодному інструменті.");
            return;
        }
        System.out.println("Музикант грає на:");
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public void addInstrument(Instrument instrument) {
        for (Instrument inst : instruments) {
            if (inst.getClass().equals(instrument.getClass())) {
                System.out.println("Музикант вже вміє грати на цьому інструменті.");
                return;
            }
        }
        instruments.add(instrument);
        System.out.println("Інструмент додано.");
    }
}