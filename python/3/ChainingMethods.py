class User :
    
    def __init__(self,name,balance=0):
        self.name=name
        self.balance=balance


    def make_withdrawal(self, amount):
        self.balance-=amount
        return self
    def make_deposit(self,amount):
        self.balance+=amount
        return self


    def display_user_balance(self):
        print(f"User : {self.name} , Balance :{self.balance}")
        return self


    def transfer_money(self, other_user, amount):
        self.balance-=amount
        other_user.balance +=amount
        return self


User1=User("jake")
User2=User("badwan")
User3=User("ahmad")

User1.make_deposit(100).make_deposit(50).make_deposit(25).make_withdrawal(25).display_user_balance()


User2.make_deposit(200).make_deposit(100).make_withdrawal(50).make_withdrawal(30).display_user_balance()

User3.make_deposit(300).make_withdrawal(100).make_withdrawal(50).make_withdrawal(25).display_user_balance()


User1.transfer_money(User3,100).display_user_balance()
User3.display_user_balance()

