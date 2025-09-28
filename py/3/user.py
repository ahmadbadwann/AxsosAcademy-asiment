class User :
    
    def __init__(self,name,balance=0):
        self.name=name
        self.balance=balance


    def make_withdrawal(self, amount):
        self.balance-=amount
    def make_deposit(self,amount):
        self.balance+=amount


    def display_user_balance(self):
        print(f"User : {self.name} , Balance :{self.balance}")


    def transfer_money(self, other_user, amount):
        self.balance-=amount
        other_user.balance +=amount


User1=User("jake")
User2=User("badwan")
User3=User("ahmad")

User1.make_deposit(100)
User1.make_deposit(50)
User1.make_deposit(25)
User1.make_withdrawal(25)
User1.display_user_balance()


User2.make_deposit(200)
User2.make_deposit(100)
User2.make_withdrawal(50)
User2.make_withdrawal(30)
User2.display_user_balance()

User3.make_deposit(300)
User3.make_withdrawal(100)
User3.make_withdrawal(50)
User3.make_withdrawal(25)
User3.display_user_balance()


User1.transfer_money(User3,100)
User1.display_user_balance()
User3.display_user_balance()

