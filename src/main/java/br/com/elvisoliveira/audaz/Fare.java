package br.com.elvisoliveira.audaz;

import java.util.UUID;

public class Fare {

    private UUID Id;
    private UUID OperatorId;
    private Integer Status;
    private Double Value;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID Id) {
        this.Id = Id;
    }

    public UUID getOperatorId() {
        return OperatorId;
    }

    public void setOperatorId(UUID OperatorId) {
        this.OperatorId = OperatorId;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double Value) {
        this.Value = Value;
    }

}
