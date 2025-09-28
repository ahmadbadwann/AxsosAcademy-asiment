import BankAccount
class User:
    def __init__(self, name, email):
        self.name=name
        self.email=email
        self.acaount= BankAccount(int_rate=0.02, balance=0)
        self.accounts = {
            "checking": BankAccount(0.02, 0),
            "savings": BankAccount(0.05, 100)
        }

    def make_deposit(self, amount):
        self.account.deposit(amount)
        return self

    def make_withdrawal(self, amount):
        self.account.withdraw(amount)
        return self

    def display_user_balance(self):
        print(f"User: {self.name}, Balance: {self.account.balance}")
        return self


