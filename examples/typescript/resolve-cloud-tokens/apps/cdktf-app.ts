import * as cdktf from 'cdktf';
import { CDKTFStack } from '../constructs/cdktf-stack';

const cdktfApp = new cdktf.App({ outdir: 'cdktf.out' });
new CDKTFStack(cdktfApp, 'aws');

cdktfApp.synth();
