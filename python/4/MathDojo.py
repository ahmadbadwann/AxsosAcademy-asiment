class MathDojo:
    def __init__(self):
        self.result = 0


    def add(self, num, *nums):
        self.result += num
        for n in nums:
            self.result += n
        return self



    def subtract(self, num, *nums):
        self.result -= num
        for n in nums:
            self.result -= n
        return self

