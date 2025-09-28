class BankAccount:
    def __init__(self, int_rate=0.02, balance=0):
        self.int_rate=int_rate
        self.balance=balance


        def deposit(self, amount):
            self.balance+=amount
            return self

        def withdraw(self, amount):
            if(self.balance<amount):
                print("Insufficient funds: Charging a $5 fee")
                self.balance-=5
            else:
                self.balance-=amount
            return self

        def display_account_info(self):
            print(f"Balance: ${self.balance}")
            return self

        def yield_interest(self):
            if self.balance >0:
                self.balance=self.balance*self.int_rate
            return self
