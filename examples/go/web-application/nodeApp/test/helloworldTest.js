'use strict'

const chai = require('chai');
const expect  = require('chai').expect;
const helloWorld = require('./../src/helloworld');

//Hello world tests
const foo = 'bar';
describe('Hello World Tests',() => {
  describe('Dummy test', () => {
    it('is a dummy test', () => {
      expect(foo).to.be.a('string');
      expect(foo).to.equal('bar');
      expect(foo).to.have.lengthOf(3);
    });
  });
  describe('Real (not very useful) test', () => {
    it('Build hello string', () => {
      const myHostname = 'superHostName'
      let helloString = helloWorld.buildHello(myHostname)
      expect(helloString).to.be.a('string');
      expect(helloString).to.equal(`Hello world from host: ${myHostname}` )
    })
  });
})
