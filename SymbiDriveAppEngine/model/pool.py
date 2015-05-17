'''
Created on Apr 22, 2015

@author: andreea
'''
from google.appengine.ext import ndb

class Pool(ndb.Model):
    '''
    Models an individual Pool entry with driver, passengers, source_point, destination_point,
    date, seats, is_weekly
    '''
    
    ''' Might need to change driver and passengers list to match the social ID'''
    driver_socialID = ndb.StringProperty(required=True)
    passengers = ndb.IntegerProperty(repeated=True)
    source_point = ndb.GeoPtProperty(required=True)
    destination_point = ndb.GeoPtProperty(required=True)
    date = ndb.DateTimeProperty(required=True)
    seats = ndb.IntegerProperty(required=True)
    is_weekly = ndb.BooleanProperty(default=False)
    
    def add_passenger(self, userID):
        if (self.passengers is None):
            self.passengers = [userID]
        else:
            self.passengers.append(userID)
    
    
    