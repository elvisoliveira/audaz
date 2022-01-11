package br.com.elvisoliveira.audaz;

import java.util.List;
import java.util.UUID;

public class FareService {

    private final Repository<Fare> repository;

    public FareService() {
        repository = new Repository<>();
    }

    public void create(Fare fare) {
        repository.insert(fare);
    }

    public void update(Fare fare) {
        repository.update(fare);
    }

    public Fare getFareById(UUID fareId) {
        return repository.getById(fareId);
    }

    public List<Fare> GetFares() {
        return repository.getAll();
    }

}
