- The 4 compartments [merchant, operations, payment, vault] can be allocated to different teams when we need to migrate to Microservices from Monolith.
- same code which will be used by all can be in the same package like [ enums & exception ].


```
## How the Card Payment happens?
- First the checkout page needs to call the tokenize API [ Vault/VaultController.java -> tokenize() ] to get the token back.
- Then it will call the payment initiate API [ Payment/PaymentController.java -> initiate() ] to initiate the payment. And the token is coming inside the initiate() in the PaymentInitRequest inside the PaymentServiceImpl.java file.
Checking order exist or not & increase attemt count & create a new payment. Using this we are going to call our PaymentgatewayRouter.initiate(paymentRequest) .

- Then the PaymentgatewayRouter will get to know that they want the Card payment method & it will call the CardPaymentAdapter.initiate() . It will fetch the token from the request. From this we will call the vaultService.charge()
- Now vaultService.charge() will fetch the token from DB if it is exist & not revoked earlier, ......

- Then paymentProcessorRouter.charge() will be called to charge. It will see that the payment method is card & it will call the charge() of the CardPaymentProcessor .

- After that the response will come into the VaultService & it will be in the pending/failure state depends.

- Now the response goes to the CardPaymentAdapter & it will give the response back to the service that called it (PaymentServiceImpl).
```



```azure
Payment Adapter -> PaymentProcessor -> Talks to the 3rd party services & it returns back to the -> It returns back to the payment gateway.
```







### Simulator
`Payment/simulator/BankCallbackSimulator.java`
1.`processCallbacks()` will be called in every 5 seconds. It will gonna find the payments from last 1 second to the last 6 second window. After that we are simulate that using `simulateCallback()`.
2.`simulateCallback()` will get the method config first, then `dueAt()` defined for when this payment should be processed basically.
3.`dueAt()` has already min & max delay seconds defined each payment type & it will generate a random delay seconds from it. Then if it is in slow mode it will delay seconds which is hardcoded.
Then it's return the payment creation time with added delay seconds.
4. Then we return inside `processCallbacks()` to check if our curent time has passed the dueAt window or not!! if it's passed we will process it on the basis of CHAOS MODE & if not we will process it later on.
5. In NORMAL & SLOW mode we `shouldApprove()` will be called first then `resolve()` depend upon their approval rate.
6. Then `shouldApprove()` to find out if the payment is approve or not by using the payment ID.
7. `resolve()` will call payment service `resolveAuthorization()` method. IT's a real method inside payment service. Incase of real senario payment processor will be calling this `resolveAuthorization()` [ That's how we are building this, it has our own payment processor] & in case of simulation, 
simulation will be calling it. Then the payment processor unit will call the payment gateway unit, that's how two services are communicating.
8. Now this `resolveAuthorization` will take this payment to 'AUTHORIZED' or 'FAILED' state.