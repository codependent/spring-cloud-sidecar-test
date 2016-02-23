var express = require('express');
var router = express.Router();

var letters = ['a','b','c','d',
               'e','f','g','h',
               'i','j','k','l',
               'm','n','o','p',
               'q','s','s','t',
               'u','v','w','x',
               'y','z'];

/* GET letters listing. */
router.get('/', function(req, res, next) {
  var random = Math.round(Math.random()* (letters.length-1));
  var auth = letters[random]
  res.json({letter : auth});
});

module.exports = router;
