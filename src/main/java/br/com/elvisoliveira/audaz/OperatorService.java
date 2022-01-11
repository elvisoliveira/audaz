package br.com.elvisoliveira.audaz;

import java.util.List;
import java.util.UUID;

public class OperatorService {

    private final Repository<Operator> repository;

    public OperatorService() {
        repository = new Repository<>();
    }

    public Operator getOperatorByCode(String code) {
        List<Operator> operators = repository.getAll();
        return operators.stream()
                .filter(x -> x.getCode().equals(code))
                .findFirst().get();
    }

    public Operator getOperatorById(UUID id) {
        return repository.getById(id);
    }

    public List<Operator> getOperators() {
        return repository.getAll();
    }

    public void create(Operator operator) {
        repository.insert(operator);
    }

    public void update(Operator operator) {
        repository.update(operator);
    }

}
