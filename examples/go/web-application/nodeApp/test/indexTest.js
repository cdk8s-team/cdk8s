'use strict'

const chai = require('chai');
const expect  = require('chai').expect;
const chaiHttp = require('chai-http');
const app = require('./../src/index');

chai.use(chaiHttp);

//Main page tests
const foo = 'bar';
describe('Index Tests',() => {
  describe('Dummy test', () => {
    it('is a dummy test', () => {
      expect(foo).to.be.a('string');
      expect(foo).to.equal('bar');
      expect(foo).to.have.lengthOf(3);
    });
  });
  describe('HTTP End point tests', () => {
    it('Returns hello world when hitting root', done => {
      chai.request("localhost:3000")
        .get("/")
        .end((err,res) => {
          expect(err).to.be.null;
          expect(res).to.have.status(200);
          done();
        });
    });
  });
})
