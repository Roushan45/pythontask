class Book(object):
    """A Book Object."""
    def __init__(self, title, author, pub_yr='Unknown'):
        self.title = title
        self.author = author
        self.pub_yr = pub_yr
    def __repr__(self):
        return '<Book. Title: %s.>' % (self.title)
#in b1 object of Book
#year is passing as parameter
b1=Book("The Bell Jar","Sylvia Plath",1963)
#in b2 object of Book
#year is not passing in parameter
#in this case b2 pub_yr will be used 
#default value that is Unkmowm
b2 = Book("Anna Karenina","Leo Tolstoy")
#printing book b1 information
print "\nBook b1 : ",b1
print 'Book b1 Publication year : ',b1.pub_yr
#printing book b2 information
print'\n'
print "Book b2 : ",b2
print 'Book b2 Publication year : ',b2.pub_yr