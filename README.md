college-math-calculator/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── mathcalculator/
        │           ├── CollegeMathCalculatorApplication.java
        │           ├── controller/
        │           │   ├── WebController.java       // Serves the HTML pages
        │           │   └── MathApiController.java   // Handles API requests
        │           ├── dto/
        │           │   └── MathRequest.java       // Data Transfer Object for API
        │           └── service/
        │               └── MathService.java         // Core calculation logic
        └── resources/
            ├── static/
            │   └── css/
            │       └── custom.css      // Optional: for styles not in index.html
            ├── templates/
            │   ├── layout.html         // Main layout with header/footer
            │   ├── index.html          // Your existing home page
            │   ├── calculator.html     // Dedicated general calculator page
            │   ├── calculus.html       // Page for calculus functions
            │   ├── algebra.html        // Page for algebra functions
            │   ├── matrix.html         // Page for matrix operations
            │   └── about.html          // The about page
            └── application.properties  // Spring Boot configuration
