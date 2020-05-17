import {MyChart, Testing} from './main';
import {App} from "cdk8s";

describe('Placeholder', () => {
    test('Empty', () => {
        const app = new App();
        const chart = new MyChart(app, 'test-chart');
        const results = Testing.synth(chart)
        expect(results).toHaveLength(0);
    });
});
