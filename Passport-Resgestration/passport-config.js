const localStratergy  = require('passport-local').Strategy
const bcrypt = require('bcrypt');
const { use } = require('passport');

function intialize(passport,getUserByEmailId,getUserById){
    const authenticateUser = async (email, password, done) =>{
        const user = getUserByEmailId(email)
        if(user == null)
        {
            return done(null , false , {message : 'no user found'})
        }

        try {
            if(await bcrypt.compare(password,user.password))
            {
                return done(null,user)
            }
            else{
                return done(null,false,{message :"password is incorrect"})
            }
        } catch (error) {
            
        }

    }
    passport.use(new localStratergy({usernameField : 'email'},authenticateUser))
    passport.serializeUser((user,done)=> done(null , user.id))
    passport.deserializeUser((id,done)=> {
    return done(null , getUserById(id))
    })
}

module.exports = intialize;