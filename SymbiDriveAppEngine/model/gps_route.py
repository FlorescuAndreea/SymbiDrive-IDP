'''
Created on Apr 22, 2015

@author: andreea
'''
from google.appengine.ext import ndb

class GPSRoute(ndb.Model):
    '''
    classdocs
    '''
    pool_id = ndb.IntegerProperty(required=True)
    user_id = ndb.IntegerProperty(required=True)
    route_points = ndb.GeoPtProperty(repeated=True)    