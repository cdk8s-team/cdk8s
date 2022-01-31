'use strict'

const chai = require('chai');
const expect  = require('chai').expect;
const mariaDbData = require('./../src/mariaDbData');

//Pull DB data test
const foo = 'bar';
describe('Data Tests',() => {
  describe('Dummy Test', () => {
    it('is a dummy test', () => {
      expect(foo).to.be.a('string');
      expect(foo).to.equal('bar');
      expect(foo).to.have.lengthOf(3);
    });
  });
  describe('Get Data from the DB', () => {
    it('Get data from test table', async () => {
      let myData = await mariaDbData.getMariaBbData();
      expect(myData).to.not.be.null;
      expect(myData).to.be.an('array');
    });
  })
})
