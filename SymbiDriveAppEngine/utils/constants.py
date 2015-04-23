'''
Created on Apr 23, 2015

@author: andreea
'''
class SocialProfile(object):
    FACEBOOK = "Facebook"
    GOOGLE = "Google+"

class ExitCode(object):
    USER_ALREADY_REGISTERED = "USER_ALREADY_REGISTERED"
    USER_REGISTER_WITH_OTHER_PROFILE = "USER_REGISTER_WITH_OTHER_PROFILE"
    USER_REGISTER_ON_OTHER_DEVICE = "USER_REGISTER_ON_OTHER_DEVICE"
    USER_CREATED = "USER_CREATED"
    INVALID_USER = "INVALID_USER"
    
    PROFILE_UPDATED = "PROFILE_UPDATED"
    
    RATING_ADDED = "RATING_ADDED"
    INVALID_RATING = "INVALID_RATING"
    
    FEEDBACK_ADDED = "FEEDBACK_ADDED"
    INVALID_FEEDBACK = "INVALID_FEEDBACK"