import {MyChart} from './main';
import {Testing} from "cdk8s";

describe('Simple', () => {
    test('one thing', () => {
        const app = Testing.app();
        const chart = new MyChart(app, 'test-chart');
        const results = Testing.synth(chart)
        expect(results).toHaveLength(1);
    });
});
