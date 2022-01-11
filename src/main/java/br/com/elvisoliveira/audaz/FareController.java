package br.com.elvisoliveira.audaz;

import java.util.UUID;

public class FareController {

    private final OperatorService _operatorService;
    private final FareService fareService;

    public FareController() {
        fareService = new FareService();
        _operatorService = new OperatorService();
    }

    public void createFare(Fare fare, String operatorCode) {
        Operator operator = new Operator();
        operator.setId(UUID.randomUUID());
        operator.setCode("OP01");
        _operatorService.create(operator);
        
        Operator selectedOperator = _operatorService.getOperatorByCode(operatorCode);
        fare.setOperatorId(selectedOperator.getId());
        fareService.create(fare);
    }

}
