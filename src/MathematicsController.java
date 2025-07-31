package src;

import src.service.MathCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/math")
@CrossOrigin(origins = "*")
public class MathematicsController {

    @Autowired
    private MathCalculatorService mathService;

    @PostMapping("/calculate")
    public ResponseEntity<CalculationResultModel> calculate(@RequestBody CalculationRequestModel request) {
        try {
            CalculationResultModel result = mathService.performCalculation(request);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            CalculationResultModel errorResult = new CalculationResultModel();
            errorResult.setError("Error: " + e.getMessage());
            return ResponseEntity.badRequest().body(errorResult);
        }
    }

    @PostMapping("/integrate")
    public ResponseEntity<CalculationResultModel> integrate(@RequestBody CalculationRequestModel request) {
        try {
            CalculationResultModel result = mathService.performIntegration(request);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            CalculationResultModel errorResult = new CalculationResultModel();
            errorResult.setError("Error: " + e.getMessage());
            return ResponseEntity.badRequest().body(errorResult);
        }
    }

    @PostMapping("/differentiate")
    public ResponseEntity<CalculationResultModel> differentiate(@RequestBody CalculationRequestModel request) {
        try {
            CalculationResultModel result = mathService.performDifferentiation(request);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            CalculationResultModel errorResult = new CalculationResultModel();
            errorResult.setError("Error: " + e.getMessage());
            return ResponseEntity.badRequest().body(errorResult);
        }
    }

    @PostMapping("/solve-equation")
    public ResponseEntity<CalculationResultModel> solveEquation(@RequestBody CalculationRequestModel request) {
        try {
            CalculationResultModel result = mathService.solveEquation(request);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            CalculationResultModel errorResult = new CalculationResultModel();
            errorResult.setError("Error: " + e.getMessage());
            return ResponseEntity.badRequest().body(errorResult);
        }
    }

    @PostMapping("/matrix-operations")
    public ResponseEntity<CalculationResultModel> matrixOperations(@RequestBody CalculationRequestModel request) {
        try {
            CalculationResultModel result = mathService.performMatrixOperations(request);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            CalculationResultModel errorResult = new CalculationResultModel();
            errorResult.setError("Error: " + e.getMessage());
            return ResponseEntity.badRequest().body(errorResult);
        }
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Math Calculator Service is running!");
    }
}