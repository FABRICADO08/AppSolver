package src;

import java.util.List;
import java.util.Map;

public class CalculationRequestModel {
    private String expression;
    private String variable;
    private String operationType;
    private Double lowerLimit;
    private Double upperLimit;
    private List<List<Double>> matrix1;
    private List<List<Double>> matrix2;
    private String matrixOperation;
    private Map<String, Double> variables;
    private String equationType;

    // Constructors
    public CalculationRequestModel() {}

    public CalculationRequestModel(String expression, String operationType) {
        this.expression = expression;
        this.operationType = operationType;
    }

    // Getters and Setters
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Double getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public Double getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
    }

    public List<List<Double>> getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(List<List<Double>> matrix1) {
        this.matrix1 = matrix1;
    }

    public List<List<Double>> getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(List<List<Double>> matrix2) {
        this.matrix2 = matrix2;
    }

    public String getMatrixOperation() {
        return matrixOperation;
    }

    public void setMatrixOperation(String matrixOperation) {
        this.matrixOperation = matrixOperation;
    }

    public Map<String, Double> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Double> variables) {
        this.variables = variables;
    }

    public String getEquationType() {
        return equationType;
    }

    public void setEquationType(String equationType) {
        this.equationType = equationType;
    }
}