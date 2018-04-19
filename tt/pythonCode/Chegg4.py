import json
class Item:
    def __init__(self, code, desc, price, quantity):
        self.__code = code  # the item code
        self.__description = desc  # the item description
        self.__price = price  # the item unit price
        self.__quantity = quantity  # the number of item available

    def getCode(self):
        return self.__code

    def setCode(self, code):
        self.__code = code;

    def getDescription(self):
        return self.__description

    def setDescription(self, desc):
        self.__description = desc

    def getPrice(self):
        return self.__price

    def setPrice(self, price):
        self.__price = price

    def getQuantity(self):
        return self.__quantity

    def setQuantity(self, quantity):
        self.__quantity = quantity

    def __repr__(self):
        return 'Item({0}, {1}, {2}, {3})'.format(self.__code, self.__description, self.__price, self.__quantity)

    def __str__(self):
        return '{0}, {1}, {2}, {3}'.format(self.__code, self.__description, str(self.__price), str(self.__quantity))


class stock:
    def __init__(self):
        self.__items = []

    # This function gets the number of items in stock.
    def get_size(self):
        return len(self.__items)

    # This function loads all the items on sale into the list.
    def load_items(self, filename):
        try:
            infile = open(filename, "r")
            stock_str = infile.read()
            infile.close()
            stock_list = stock_str.split("\n")
            for item in stock_list:
                if item != "":
                    #print(item)
                    item_list = json.loads(item)
                    self.__items += [Item(item_list[0], item_list[1], item_list[2], item_list[3])]
        except IOError:
            print("Error: File does not exist.")

            # This function saves all the items on sale into a file.

    def save_items(self, filename):
        try:
            out_file = open(filename, 'w')
            for item in self.__items:
                item_list = [item.getCode(), item.getDescription(), item.getPrice(), item.getQuantity()]
                str_out = json.dumps(item_list)
                out_file.write(str_out + "\n")
            out_file.close()
        except IOError:
            print("Error: File writing error.")


# This function finds an item on sale based on the item code.
    def find_item(self, code):
        # variable for tracking if found or not
        found=False
        # looping through all elements in itema
        for i in self.__items:
            # if code found
            if i.getCode() == code:
                # marking found as true
                found=True
                # printing the item
                return i
        if found is False:
            return None

    # This function displays all the items on sale.
    def display_items(self):
        print("\nPrinting all items in sale \n")
        print("Code \t  Description \t Price \t Quantity\n")
        # looping through items and printing
        # __str__ method above defined already in
        # item class
        for item in self.__items:
            print(item)


class Cart:
    # the constructor
    def __init__(self):
        self.__items = []

    # This function gets the number of items in the shopping cart.
    def get_size(self):
        return len(self.__items)

    # This function adds an item into the shopping cart.
    def add_item(self, item):
        if item is not None:
            self.__items.append(item)

    # This function finds an item on sale based on the item code.
    def find_item(self, code):
        # variable for tracking if found or not
        found = False
        # looping through all elements in shopping cart
        for i in self.__items:
            # if code found in shopping cart
            if i.getCode() == code:
                # marking found as true
                found = True
                # printing the item
                print(i)
                break
        if found is False:
            print(code + " not found in shopping cart")

    # This function removes an item from the shopping cart.
    def delete_item(self, item):
        if item in self.__items:
            self.__items.remove(item)

    # This function clears everything in the shopping cart.
    def discard_all(self):
        self.__items=[]

    # This function prints out the items bought and calculates the total amount due.
    def check_out(self):
        total=0
        print("\nPrinting all items in cart  \n")
        print("Code \t  Description \t Price \t Quantity\n")
        # looping through items and printing
        # __str__ method above defined already in
        # item class
        for item in self.__items:
            print(item)
            total = total+(float(item.getQuantity()) * float(item.getPrice()))
        print("\nTotal Amount Due : "+str(total))


# running the program
if __name__ == "__main__":
    # created object of stock
    stk = stock()
    # loaded the elements from file
    stk.load_items('items.txt')
    # created 5 items from stock object
    item1 = stk.find_item("BC007")
    item2 = stk.find_item("BC012")
    item3 = stk.find_item("BC018")
    item4 = stk.find_item("BC015")
    item5 = stk.find_item("BC010")
    # created cart
    crt = Cart()
    # added 3 values to cart
    crt.add_item(item1)
    crt.add_item(item2)
    crt.add_item(item3)
    # checking if the cart contains item 4
    # as it is not yet added
    print("Does Cart contains   "+str(item4)+" : ")
    crt.find_item(item4.getCode())
    # checking already added item in cart
    print("Does Cart contains   " + str(item1) + " : ")
    crt.find_item(item1.getCode())
    # removing item from cart
    print("Removing "+str(item2)+" from cart ")
    # printing the cart size
    print("Size of cart : "+str(crt.get_size()))
    # adding one more item to cart
    crt.add_item(item5)
    # checking out the cart
    crt.check_out()
    print("\nDiscaring the card ")
    # discarded the all value in cart
    crt.discard_all()
    # after that printing the size of cart
    print("After discarding the cart , size of cart : "+str(crt.get_size()))
