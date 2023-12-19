package com.SEAssignment.Rest.API.bank;
import com.SEAssignment.Rest.API.auth.AuthRequest;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bankaccount")
@Hidden
public class BankerController {
    private int account_balance=100;
    @GetMapping
    public ResponseEntity<String> getBalance() {
        return ResponseEntity.ok("Current Balance: $"+account_balance);
    }
    @PostMapping
    public ResponseEntity<String> deposit(@RequestBody String amount) {
        account_balance+=Integer.parseInt(amount);
        return ResponseEntity.ok("Successfully deposited: "+amount +". New Balance: "+account_balance);
    }
}
