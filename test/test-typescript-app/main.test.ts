import {MyChart} from './main';
import {App, Testing} from "cdk8s";

describe('Simple', () => {
    test('one thing', () => {
        const app = new App();
        const chart = new MyChart(app, 'test-chart');
        const results = Testing.synth(chart)
        expect(results).toHaveLength(1);
    });
});
